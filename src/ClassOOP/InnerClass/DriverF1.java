package ClassOOP.InnerClass;

public class DriverF1 {
    private String driverName;

    public String getDriverName(){
        return this.driverName;
    }

    public void setDriverName(String name){
        this.driverName = name;
    }

    public class F1Team {
        private String teamName;

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }
    }



    public static void main(String[] args) {
        DriverF1 vettel = new DriverF1();
        vettel.setDriverName("Sebastian Vettel");
        DriverF1.F1Team astonMartin = vettel.new F1Team();
        astonMartin.setTeamName("Aston Martin");


        System.out.println(vettel.getDriverName() + " membalap untuk " + astonMartin.getTeamName());

        DriverF1 max  = new DriverF1();
        max = vettel;

        max.setDriverName("Max Verstapen");

        System.out.println(vettel.getDriverName() + " membalap untuk " + astonMartin.getTeamName());
        System.out.println(max.getDriverName() + " membalap untuk " + astonMartin.getTeamName());
    }
}
