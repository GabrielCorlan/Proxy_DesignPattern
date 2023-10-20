public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getRole(String employeeName){
        // check role from database based on employee name
        // return job level
        return 7;
    }

    @Override
    public void grantInternetAccess() {
        if(getRole(employeeName) >= 5){
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }
        else{
            System.out.println("No internet access granted. Your job level is below 5");
        }
    }
}
