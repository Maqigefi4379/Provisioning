package jp.co.internous.provisioning.dto;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReservationInfoDTOTest {
	@Test
	public void testGetCustomerId() {
		int customerId = 3;
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setCustomerId(3);
		assertEquals(customerId, expected.getCustomerId());
	}
	@Test
	public void testSetCustomerId() {
		int customerId = 3;
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setCustomerId(3);
		int value = expected.getCustomerId();
		assertEquals(customerId, value);
	}

	@Test
	public void testGetPortName() {
		String portName = "駐輪場名";
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setPortName("駐輪場名");
		assertEquals(portName, expected.getPortName());
	}
	@Test
	public void testSetPortName() {
		String portName = "駐輪場名";
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setPortName("駐輪場名");
		String value = expected.getPortName();
		assertEquals(portName, value);
	}

	@Test
	public void testSetCycleId() {
		int cycleId = 3;
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setCycleId(3);
		assertEquals(cycleId, expected.getCycleId());
	}
	@Test
	public void testGetCycleId() {
		int cycleId = 3;
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setCycleId(3);
		int value = expected.getCycleId();
		assertEquals(cycleId, value);
	}

	@Test
	public void testSetPlan() {
		int plan = 3;
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setPlan(3);
		assertEquals(plan, expected.getPlan());
	}
	@Test
	public void testGetPlan() {
		int plan = 3;
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setPlan(3);
		int value = expected.getPlan();
		assertEquals(plan, value);
	}
	@Test
	public void testGetReservationDate() {
		String reservationDate = "利用日時";
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setReservationDate("利用日時");
		assertEquals(reservationDate, expected.getReservationDate());
	}
	@Test
	public void testSetReservationDate() {
		String reservationDate = "利用日時";
		ReservationInfoDTO expected = new ReservationInfoDTO();
		expected.setReservationDate("利用日時");
		String value = expected.getReservationDate();
		assertEquals(reservationDate, value);
	}
}
