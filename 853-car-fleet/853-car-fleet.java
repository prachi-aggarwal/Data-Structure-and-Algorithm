class Solution {
   
        
     public static class pair implements Comparable<pair>{
         int distance;
         int speed;
         double time;
         pair(int distance,int speed){
             this.distance=distance;
             this.speed=speed;
             this.time=(distance*1.0)/speed;
             
         }
         public int compareTo(pair other){
             return this.distance-other.distance;
         }
         
         
         
         
         
     }   
         public int carFleet(int target, int[] position, int[] speed) {
        
        int n=position.length;
             pair [] cars=new pair[n];
             for(int i=0;i<n;i++){
                 cars[i]=new pair(target-position[i],speed[i]);
             }
        
    Arrays.sort(cars);
             
             
             double maxTime=0.0;
             int groups=0;
             for(int i=0;i<n;i++){
                 if(cars[i].time>maxTime){
                     maxTime=cars[i].time;
                     groups++;
                 }
             }
             
        
        
        
        
        return groups;
        
        
        
        
        
        
    }
}