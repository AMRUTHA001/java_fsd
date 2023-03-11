
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleRegistration {
    
    @Test
    public void testGetStateAndDistrict_KL07_ReturnsKeralaErnakulam() {
        VehicleRegistration vr = new VehicleRegistration();
        String[] stateAndDistrict = vr.getStateAndDistrict();
        assertEquals("Kerala", stateAndDistrict[0]);
        assertEquals("Ernakulam", stateAndDistrict[1]);
    }
    
    private String[] getStateAndDistrict() {
		// TODO Auto-generated method stub
		return null;
	}

	private void assertEquals(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testGetStateAndDistrict_TN20_ReturnsTamilNaduCoimbatore() {
        VehicleRegistration vr = new VehicleRegistration();
        String[] stateAndDistrict = vr.getStateAndDistrict();
        assertEquals("Tamil Nadu", stateAndDistrict[0]);
        assertEquals("Coimbatore", stateAndDistrict[1]);
    }
    
}

public class VehicleRegistration1 {
    
    private String registrationNumber;
    
    public VehicleRegistration1(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    public String[] getStateAndDistrict() {
        String state = "";
        String district = "";
        if (registrationNumber.startsWith("KL")) {
            state = "Kerala";
            if (registrationNumber.endsWith("01")) {
                district = "Thiruvananthapuram";
            } else if (registrationNumber.endsWith("02")) {
                district = "Kollam";
            } else if (registrationNumber.endsWith("03")) {
                district = "Pathanamthitta";
            } else if (registrationNumber.endsWith("04")) {
                district = "Alappuzha";
            } else if (registrationNumber.endsWith("05")) {
                district = "Kottayam";
            } else if (registrationNumber.endsWith("06")) {
                district = "Idukki";
            } else if (registrationNumber.endsWith("07")) {
                district = "Ernakulam";
            } else if (registrationNumber.endsWith("08")) {
                district = "Thrissur";
            } else if (registrationNumber.endsWith("09")) {
                district = "Palakkad";
            } else if (registrationNumber.endsWith("10")) {
                district = "Malappuram";
            } else if (registrationNumber.endsWith("11")) {
                district = "Kozhikode";
            } else if (registrationNumber.endsWith("12")) {
                district = "Wayanad";
            } else if (registrationNumber.endsWith("13")) {
                district = "Kannur";
            } else if (registrationNumber.endsWith("14")) {
                district = "Kasaragod";
            }
        } else if (registrationNumber.startsWith("TN")) {
            state = "Tamil Nadu";
            if (registrationNumber.endsWith("01")) {
                district = "Chennai";
            } else if (registrationNumber.endsWith("02")) {
                district = "Coimbatore";
            } else if (registrationNumber.endsWith("03")) {
                district = "Madurai";
            } else if (registrationNumber.endsWith("04")) {
                district = "Tiruchirappalli";
            } else if (registrationNumber.endsWith("05")) {
                district = "Salem";
            } else if (registrationNumber.endsWith("06")) {
                district = "Vellore";
            } else if (registrationNumber.endsWith("07")) {
                district = "Tirunelveli";
            } else if (registrationNumber.endsWith("08")) {
                district = "Thoothukudi";
            } else if (registrationNumber.endsWith("09")) {
               

	
            }
        }
    }
}
	