// write hashmap
class MyHashMap {
private LinkedList<hmnode>[] bucket;
    private int noofnode;
    private int noofbucket;
    
    public MyHashMap() {
     // noofnodes=0;
        noofbucket=10000;
        bucket=new LinkedList[noofbucket];
        for(int i=0;i<noofbucket;i++){
            bucket[i]=new LinkedList<>();
        }
    }
    public int getid(int key){
        int id=Integer.hashCode(key);
        int keyid=Math.abs(id%noofbucket);
        return keyid;
    }
    public hmnode getdata(int key,int keyid){
        // int keyid=getid(key);
        int count=0;
        for(hmnode node:bucket[keyid]){
            if(node.key==key){
                return node;
            }
        }
        return null;
    }
    public void put(int key, int value) {
       int keyid=getid(key);
        hmnode data=getdata(key,keyid);
        if(data==null){
        hmnode node=new hmnode(key,value);
            bucket[keyid].addLast(node);
        }
        else{
           data.value=value;
        } 
        
        
    }
    
    public int get(int key) {
        int keyid=getid(key);
       hmnode data=getdata(key,keyid);
        if(data!=null)
        return data.value;
        
        return -1;
        
    }
    
    public void remove(int key) {
     int keyid=getid(key);
       hmnode data=getdata(key,keyid);
        if(data!=null){
            bucket[keyid].remove(data);
        }
        // return null;
    }
    public class hmnode{
        int key;
        int value;
      public hmnode(int key,int value) {
      this.key=key;
          this.value=value;
      } 
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */



// write hashset
class MyHashSet {
private LinkedList<hmnode>[] bucket;
    private int noofnode;
    private int noofbucket;
    
    public MyHashSet() {
        
      noofbucket=10000;
        bucket=new LinkedList[noofbucket];
        for(int i=0;i<noofbucket;i++){
            bucket[i]=new LinkedList<>();
        }   
    }
     public int getid(int key){
        int id=Integer.hashCode(key);
        int keyid=Math.abs(id%noofbucket);
        return keyid;
    }
    public hmnode getdata(int key,int keyid){
        // int keyid=getid(key);
        int count=0;
        for(hmnode node:bucket[keyid]){
            if(node.key==key){
                return node;
            }
        }
        return null;
    }
    
    public void add(int key) {
       int keyid=getid(key);
        hmnode data=getdata(key,keyid);
        if(data==null){
        hmnode node=new hmnode(key);
            bucket[keyid].addLast(node);
        }
        else{
           // data.value=value;
        } 
          
    }
    
    public void remove(int key) {
     int keyid=getid(key);
       hmnode data=getdata(key,keyid);
        if(data!=null){
            bucket[keyid].remove(data);
        }    
    }
    
    public boolean contains(int key) {
       int keyid=getid(key);
        hmnode data=getdata(key,keyid);
        if(data==null){
        return false;
        }
        else{
return true;
        } 
          
    }
     public class hmnode{
        int key;
        // int value;
      public hmnode(int key) {
      this.key=key;
          // this.value=value;
      } 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
