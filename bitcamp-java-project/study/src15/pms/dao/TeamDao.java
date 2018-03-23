package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Team;

public class TeamDao {

    Team[] teams = new Team[1000];
    int teamIndex = 0;
    private int i;
    
    public void insert(Team team) {
        this.teams[this.teamIndex++] = team;
    }
    
    public Team[] list() {
        Team[] arr = new Team[this.teamIndex];
        for (int i = 0; i < this.teamIndex; i++) 
            arr[i] = this.teams[i];
        return arr;
     }
   
    public Team get(String name) {
        for (i = 0; i < this.teamIndex; i++) {
            if (this.teams[i] == null) continue;
            if (name.equals(this.teams[i].name.toLowerCase())) {
                return this.teams[i];
            }
        }
        return null;
    }
    public void update(Team team) {
        this.teams[i] = team;
    }
    
    public void delete(Team team) {
        this.teams[i] = null;
    }
    
}
