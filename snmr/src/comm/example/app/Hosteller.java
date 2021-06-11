package comm.example.app;

import comm.example.Student;

class Hosteller extends Student
{
    private String hostelName;
    private int roomNumber;
    public Hosteller()
    {
        hostelName=" ";
        roomNumber=0;
    }
    public void setHostelName(String x)
    {
        hostelName=x;
    }
    public void setRoomNumber(int y)
    {
        roomNumber=y;
    }
    public String getHostelName()
    {
        return hostelName;
    }
    public int getRoomNumber()
    {
        return roomNumber;
    }
	public void setPhone(String y1) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("null")
	public int getStudentId() {
		// TODO Auto-generated method stub
		return (Integer) null;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("null")
	public int getDepartmentId() {
		// TODO Auto-generated method stub
		return (Integer) null;
	}
	public String getPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setStudentId(int a1) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String b1) {
		// TODO Auto-generated method stub
		
	}
	public void setDepartmentId(int c1) {
		// TODO Auto-generated method stub
		
	}
	public void setGender(String d1) {
		// TODO Auto-generated method stub
		
	}
	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}
}