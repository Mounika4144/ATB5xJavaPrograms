package src.Oops_07_20Dec.Encapsulation;

public class Lab062 {

    public static void main(String[] args) {

        // Hidden
        vmologinFixed vmologin = new vmologinFixed("admin", "admin");


        boolean check = vmologin.isloggedIn("admin", "admin");
        String u = vmologin.getUsername();
        System.out.println(u);
       // String p = vmologinFixed.getUserpassword();
        System.out.println(check);

    }
    }
    class vmologinFixed{

        public String getUsername() {
            return Username;
        }

        public void setUsername(String username) {
            Username = username;
        }

        private String Username;
        private String Password;

        vmologinFixed(String u, String p){
            this.Username = u;
            this.Password = p;
        }

        boolean isloggedIn(String Username , String Password){
            if(this.Username.toLowerCase().equals(Username) && this.Password.toLowerCase().equals(Password))
            {
                System.out.println("Logged in!!");
                return true;
            }
            else {
                System.out.println("Wrong");
                return false;
            }

        }


    }

