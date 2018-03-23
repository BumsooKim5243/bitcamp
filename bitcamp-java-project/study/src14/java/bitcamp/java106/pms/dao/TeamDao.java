package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Team;

public class TeamDao {

    Team[] teams = new Team[1000];
    int teamIndex = 0;
    
    public void insert(Team team) {
        this.teams[this.teamIndex++] = team;
    }
    
    public Team[] list() {
        Team[] arr = new Team[teamIndex];
        for (int i = 0; i < teamIndex; i++) 
            arr[i] = teams[i];
        return arr;
     }
    int i;
   
    public Team get(String name) {
        for (i = 0; i < this.teamIndex; i++) {
            if (teams[i] == null) continue;
            if (name.equals(teams[i].name.toLowerCase())) {
                return teams[i];
            }
        }
        return null;
    }
    public void update(Team team) {
        teams[i] = team;
    }
    
    public void delete(Team team) {
        teams[i] = null;
    }
    
}
