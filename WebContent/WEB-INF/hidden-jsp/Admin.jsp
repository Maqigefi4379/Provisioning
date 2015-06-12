<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="stylecss/Master.css" rel="stylesheet">
<title>管理情報</title>
<script type="text/javascript">
   function MoveCheck(){
      var res = confirm("選択した注文情報に間違いはありませんか？");
      if( res == true ) {
    	  return true;
      }else{
    	  return false;
      }
   }
</script>
</head>
<body>
<br>
<s:property value="#session.adminId"/>
<div class="container">
	<h1>予約情報</h1>
	
	
	<s:form action = "">
    
	</s:form>
	</div>

	<table class="table">
		<tr>
			<th>会員ID</th>
			<th>駐輪場ID</th>
			<th>自転車ID</th>
			<th>利用時間プラン</th>
			<th>予約日時</th>
			<th>完了</th>
		</tr>
		<s:iterator value="#session.reservationList">
			<tr>
			<td><s:property value="customerId"/></td>
			<td><s:property value="portName"/></td>
			<td><s:property value="cycleId"/></td>
			<td><s:property value="plan"/></td>
			<td><s:property value="reservationDate"/></td>
			<td><s:form action="EditCompleteAction">
			<input type="hidden" name="editNumber" value="<s:property value="cycleId"/>" >
			<s:submit value="このデータを削除"/>
			</s:form></td>
			</tr>
		</s:iterator>		
	</table>
	<s:form action = "LogoutAdminAction">
	<div align="right">
	<s:form action="LogoutAdminAction">
	<input type="submit" class="btn btn-default" value="管理者ログアウト" />
	</s:form>
	</div>
	</s:form>
</body>
</html>