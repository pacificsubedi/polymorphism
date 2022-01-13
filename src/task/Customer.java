package task;

public class Customer {

        private  int customer_id;
        private  String customer_name;
        private  String Dob;
        private  String phone_number;
        private  String address;
        private  int account_no;
        private  int Balance;
        Customer(int customer_id,String customer_name,String Dob,String phone_number,String address,int account_no,int balance){

                this.customer_id=customer_id;
                this.customer_name=customer_name;
                this.Dob=Dob;
                this.phone_number=phone_number;
                this.address=address;
                this.account_no=account_no;
                this.Balance=balance;
        }
        public int getCustomer_id(){
                return customer_id;
        }
        public String getCustomer_name(){
                return customer_name;
        }
        public String getDob(){
                return Dob;
        }
        public String getPhone_number(){
                return phone_number;
        }
        public String getAddress(){
                return address;
        }
        public int getAccount_no(){
                return account_no;
        }
        public int getBalance(){
                return Balance;

        }

    }

