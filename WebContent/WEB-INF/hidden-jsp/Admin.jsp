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
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="jquery.masonry.min.js"></script>
<script>
$(function(){
	$('#container').masonry({	//ここには敷き詰めたい要素を囲うidなど指定します。
		itemSelector : '.item'	//ここに敷き詰めたい要素のclassを指定します。
	});
});
</script>
<style>
.item {
width: 220px;
height: 300px;
margin: 5px;
float: left;
border: 1px solid #ccc;
background: #eee;
box-shadow: 0 2px 1px #eee;
}

.h01 {
height: 100px;	
}

.h02 {
height: 200px;
}

.h03 {
height: 300px;	
}

.h04 {
height: 400px;	
}

</style>
<script>
$(function(){
  $('#container').masonry({
    // options
    itemSelector : '.item'
  });
});
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

	<!--  <table class="table">
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
	</table>-->
	<!-- テスト用ここから -->


		<s:iterator value="#session.reservationList">
			<div class="item">
			予約情報<br>
			会員ID：<s:property value="customerId"/><br>
			駐輪場：<s:property value="portName"/><br>
			自転車ID：<s:property value="cycleId"/><br>
			予約プラン：<s:property value="plan"/><br>
			予約日時：<s:property value="reservationDate"/><br>
			<s:form action="EditCompleteAction"><br>
			<input type="hidden" name="editNumber" value="<s:property value="cycleId"/>" >
			<s:submit value="このデータを削除"/><br>
			</s:form>
			</div>
		</s:iterator>		
	<!--  テスト用ここまで -->
	<div align="right">
	<s:form action="LogoutAdminAction">
	<input type="submit" class="btn btn-default" value="管理者ログアウト" />
	</s:form>
	</div>
	
	<script src="WebContent/js/jquery.masonry.min.js"></script>

</body>
</html>