package h2;

public class H2_main {
public static void main(String[] args) {
int i=10, j=7, k=11, min=10, max= 68;
if (i>j && i>k) {max=i;
}
if (j>i && j>k) {max=j;
}
if (k>j && k>i) {max=k;
}
if (k<j && k<i) {min=k;
}
if (j<i && j<k) {min=j;
}
if (i<j && i<k) {min=i;
}
System.out.println("max is " +max);
System.out.println("min is " +min);
}
}
