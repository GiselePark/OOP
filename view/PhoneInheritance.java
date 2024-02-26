package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        System.out.println("--------집전화--------");
        Phone phone = new Phone();
        phone.setCompany("금성");
        phone.setCall("제임스");
        System.out.println(phone);
        System.out.println("--------휴대전화--------");
        CellPhone cp = new CellPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp);
        System.out.println("--------아이폰--------");
        IPhone ip = new IPhone();
        ip.setCompany("애플");
        ip.setCall("톰");
        ip.setPortable(true);
        ip.setData("전송하다");
        System.out.println(ip); //애플 아이폰으로 톰에게 휴대할 수 있음 데이터를 전송하다.
        System.out.println("--------갤럭시 노트--------");
        Samsung ss = new Samsung();
        ss.setCompany("삼성");
        ss.setCall("제인");
        ss.setPortable(true);
        ss.setData("전송하다");
        ss.setSize("10인치");
        System.out.println(ss);
        // 삼성 갤럭시 노트로 제인에게 10인치 폰을 휴대할 수 있음 데이터를 전송하다.
    }
}

class Samsung extends IPhone{
    private String size;
    static String BRAND = "갤럭시 노트";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {

        return "안드로이드폰{" +
                "제조사='" + company + '\n' +
                BRAND + '\''+
                ", 수신자='" + call + '\n' +
                "사이즈=" + size + '\n' +
                "이동성=" + portable() +
                ", 이동유무='" + move + '\n' +
                "데이터='" + super.data + '\n' +
                '}';
    }
    }
class IPhone extends CellPhone{
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    protected String data;
    private static String BRAND = "iPhone";

    @Override
    public String toString() {
        return "아이폰{" +
                "제조사='" + super.company + '\n' +
                BRAND + '\''+
                ", 수신자='" + super.call + '\n' +
                "이동성=" + super.portable() +
                ", 이동유무='" + super.move + '\n' +
                "데이터='" + data + '\n' +
                '}';
    }

}
class CellPhone extends Phone{
    private boolean portable;
    protected String move;
    protected boolean portable(){ //동어반복 회피, super햇을때 에러 뜨면 private->protected로 변경
        return portable;
    }
    public void setPortable(boolean portable){
        if(portable) {
            this.setMove("폰을 휴대할 수 있음");
        }else{
            this.setMove("폰을 휴대할 수 없음");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }
    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰{" +
                "제조사='" + super.company + '\'' +
                ", 수신자='" + super.call + '\'' +
                ", 이동성=" + portable +
                ", 이동유무='" + move + '\'' +
                '}';
    }
}
class Phone{


    protected String company, call; // 인스턴스 변수 = 멤버변수 => 힙영역
    static final double TAX_RATE = 0.095; // 스태틱 변수 = 전역변수 => 스태틱 영역

    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company = company + "에서 제작하다.";
    }
    public String getCall(){
        return call;
    }
    public void setCall(String call){
        this.call = call + "에게 전화를 걸다.";
    }


}

