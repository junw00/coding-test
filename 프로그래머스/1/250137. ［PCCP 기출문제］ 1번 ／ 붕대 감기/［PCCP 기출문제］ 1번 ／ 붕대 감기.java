class Solution {
    
    class Person {
        private final int MAX_HP;
               
        int hp;
        
        int time; //시전 시간
        
        int curTime;
        
        int recovery; //초당 회복량 
        
        int plusRecovery; //추가 회복량
        
        public Person(int MAX_HP, int hp, int time, int recovery, int plusRecovery, int curTime) {
            this.MAX_HP = MAX_HP;
            this.hp = hp;
            this.time = time;
            this.recovery = recovery;
            this.plusRecovery = plusRecovery;
        }
        
        public void attacked(int damage) {
            this.hp -= damage;
            this.curTime = 0;
            
        }
        
        public void heal() {
            this.curTime += 1;
            if(this.curTime == this.time) {
                this.hp += (this.recovery + this.plusRecovery);
                this.curTime = 0;
            }else {
                this.hp += this.recovery;
            }
            this.hp = this.MAX_HP <= this.hp ? this.MAX_HP : this.hp;
            
        }
        
    }
    
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int time = attacks[attacks.length - 1][0];
        int idx = 0;
        Person person = new Person(health, health, bandage[0], bandage[1], bandage[2], 0);
        for(int i = 1; i <= time; i++) {
            
            if(i == attacks[idx][0]) {
                person.attacked(attacks[idx][1]);

                // System.out.println("person.hp: " + person.hp);
                idx++;
                if(person.hp <= 0) return -1;

            }else person.heal();
            
            System.out.println("person.hp: " + person.hp);
            System.out.println("curTime: " + person.curTime);
            System.out.println("time: " + person.time);
        }
        
        return person.hp;
    }
}