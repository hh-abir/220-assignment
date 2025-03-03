public class WRM {
    Patient dh;

    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        if (dh.next == null){
            dh.next = new Patient(id, name, age, bloodgroup, dh, dh);
            dh.prev = dh.next;
        }else{
            Patient temp = dh;
            while (temp.next != dh){
                temp = temp.next;
            }
            temp.next = new Patient(id, name, age, bloodgroup, dh, temp);
            dh.prev = temp.next;
        }
        System.out.println("Success registering patient");;
    }

    public void servePatient() {
        if (dh.next != null){
            if (dh.next.next == dh){
                System.out.println(dh.next.name+" is served.");
                dh.next = null;
                dh.prev = null;

                return;
            }
            System.out.println(dh.next.name+" is served.");
            dh.next = dh.next.next;
            dh.next.prev = dh;
        }else{
            System.out.println("No patient to be served");
        }
    }

    public void showAllPatient() {
        if (dh.next == null){
            System.out.println("No patient in the wrm.");
            return;
        }
        Patient temp = dh.next;
        while (temp != dh) {
            if (temp.next == dh){
                System.out.print(temp.name);
            }else{
                System.out.print(temp.name+", ");
            }
            
            temp = temp.next;            
        }
        System.out.println();

    }

    public boolean canDoctorGoHome() {
        if (dh.next == null){
            System.out.println("Yes");
            return true;
        }
        System.out.println("No");
        return false; 
    }

    public void cancelAll() {
        dh.next = null;
        dh.prev = null;
        System.out.println("All appointments cancelled");
    }

    public void reverseTheLine() {
        if (dh.next == null || dh.next.next == dh){
            return;
        }
        Patient curr = dh.next, next, prev = curr;
        while (curr != dh) {
            next = curr.next;
            curr.next = curr.prev;
            curr.prev = next;
            curr = next;      
        }
        curr.next = curr.prev;
        curr.prev = prev;
    }
}