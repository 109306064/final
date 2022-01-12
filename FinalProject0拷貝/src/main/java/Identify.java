import java.util.Scanner;
 
public class Identify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("請輸入關鍵字: "); 
        String keyword = scanner.next();
        int name;
 
        switch(keyword) { 
            case "男演員": 
                int actor;
//				this.name = actor;
                return;
//				break;
            case "必看電影":
            	int mustSee;
            	break;
            case "虛擬現實":
            	int virtual;
            	break;
            case "記憶":
            	int memory;
            	break;
            case "畢業":
            	int graduation;
            	break;
            case "經典":
            	int classic;
            default: 
            	return;
        }
    }
}