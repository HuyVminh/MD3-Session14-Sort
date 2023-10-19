package BaiTap.SapXepDanhSachDoiBong;

import BaiTap.SapXepHocVienTheoDiem.Student;

public class SapXepDanhSachDoiBong {
    public static void main(String[] args) {
        FootballTeam[] teams = new FootballTeam[]{new FootballTeam(1, "Chelsea", 22, 50),
                new FootballTeam(2, "Manchester United", 25, 55),
                new FootballTeam(3, "Arsenal", 27, 56),
                new FootballTeam(4, "Burnley", 23, 34),
                new FootballTeam(5, "Tottenham", 24, 45),
                new FootballTeam(6, "Manchester City", 21, 70),
                new FootballTeam(7, "Aston Villa", 19, 46)};

        // Cách sắp xếp ID nổi bọt  :
        for (int i = 0; i < teams.length - 1; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                if (teams[i].getScore() < teams[j].getScore()) {
                    FootballTeam temp = teams[i];
                    teams[i] = teams[j];
                    teams[j] = temp;
                }
            }
        }
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
        System.out.println();

        // Cách sắp xếp chọn :
        for (int i = 0; i < teams.length - 1; i++) {
            FootballTeam currentMin = teams[i];
            int currentIndex = i;
            for (int j = i + 1; j < teams.length; j++) {
                if (currentMin.getScore() < teams[j].getScore()) {
                    currentMin = teams[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                teams[currentIndex] = teams[i];
                teams[i] = currentMin;
            }
        }
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
        System.out.println();

        // Cách sắp xếp chèn
        for (int i = 1; i < teams.length; i++) {
            FootballTeam currentElement = teams[i];
            int k;
            for (k = i - 1; k >= 0 && teams[k].getScore() < currentElement.getScore(); k--) {
                teams[k + 1] = teams[k];
            }
            teams[k + 1] = currentElement;
        }
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
    }
}
