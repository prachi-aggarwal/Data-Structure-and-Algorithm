static int maxsum=Integer.MIN_VALUE;
static Node maxsumnode=null;
public static int subtreesum(Node node){
    int sum=node.data;
    for(Node child:node.children){
        sum+=subtreesum(child);
    }
    if(sum>maxsum){
        maxsum=sum;
        maxsumnode=node;

    }
    return sum;
}
