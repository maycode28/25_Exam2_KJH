package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lastId=0;
        List<Motivation> motivations =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String cmd;
        int selectedId = -1;
        Motivation foundMotivation = null;
        System.out.println("== 명언 앱 실행 ==");
        while(true){
            System.out.print("명령어 ) ");
            cmd=sc.nextLine();
            if(cmd.contains("?")){
                String[] cmdBits = cmd.split("\\?");
                if (cmdBits.length != 2) {
                    System.out.println("올바른 명령어를 입력해주세요");
                    continue;
                }
                try{
                    selectedId=Integer.parseInt(cmdBits[1].substring(3));
                }catch(Exception e){
                    System.out.println("올바른 명령어를 입력해주세요");
                    continue;
                }
            }
            if(cmd.equals("등록")){
                int id=++lastId;
                System.out.print("명언 : ");
                String content=sc.nextLine();
                System.out.print("작가 : ");
                String author=sc.nextLine();
                Motivation motivation=new Motivation(id,content,author);
                motivations.add(motivation);
                System.out.printf("%d번 명언이 등록되었습니다.\n",id);

            } else if (cmd.equals("목록")) {
                System.out.println("번호   /   작가   /   명언");
                System.out.println("=".repeat(30));
                for(int i=motivations.size()-1;i>=0;i--){
                    Motivation motivation = motivations.get(i);
                    System.out.printf("%d   /   %s   /   %s\n",motivation.getId(),motivation.getAuthor(),motivation.getContent());
                }
            } else if (cmd.startsWith("수정")) {
                for (Motivation motivation : motivations) {
                    if (motivation.getId()==selectedId) {
                        foundMotivation=motivation;
                        break;
                    }
                }
                if(foundMotivation!=null){
                    System.out.printf("명언(기존) : %s\n", foundMotivation.getContent());
                    System.out.printf("작가(기존) : %s\n", foundMotivation.getAuthor());
                    System.out.print("명언 : ");
                    foundMotivation.setContent(sc.nextLine());
                    System.out.print("작가 : ");
                    foundMotivation.setAuthor(sc.nextLine());
                    System.out.printf("%d번 명언이 수정되었습니다.\n",selectedId);
                }else{
                    System.out.printf("%d번 명언은 존재하지 않습니다.\n",selectedId);
                }
            } else if (cmd.equals("종료")) {
                break;
            } else {
                System.out.println("올바른 명령어를 입력해주세요");
            }

        }
        System.out.println("== 명언 앱 종료 ==");
    }
}