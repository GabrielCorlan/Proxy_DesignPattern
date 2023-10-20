public class TestClient {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Tudor Dumitrescu");
        access.grantInternetAccess();
    }
}
