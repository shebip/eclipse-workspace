package in.vamsoft.dao;

public class Department {
  int deptId;
  String deptName;
  public int getDeptId() {
    return deptId;
  }
  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }
  public String getDeptName() {
    return deptName;
  }
  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }
  public Department(int deptId, String deptName) {
    super();
    this.deptId = deptId;
    this.deptName = deptName;
  }
  @Override
  public String toString() {
    return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
  }

}
