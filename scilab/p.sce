clc;
l=input("Enter the no. of vertices in the matrix. The adjacency matrix shall be read from the text file:");
h=fscanfMat("testfile1.txt");
a=h';
fid = mopen('Result.txt','w');     // Output file
mfprintf(fid,'Original matrix\n\n'); // Printing the original matrix in the output file
for i=1:l
    for k=1:l
        mfprintf(fid,'%6d',a(i,k));  
    end
    mfprintf(fid,' \n');
end

k=1:l ;
listV(k)=0 ;
listV(1)=1 ; //list of visited vertices
e=1;
while (e<l)
    mini=%inf;
    for i=1:l
        if listV(i)==1
            for j=1:l
                if listV(j)==0
                    if mini>a(i,j) & i~=j & a(i,j)~=0
                        mini=a(i,j);
                        b=a(i,j);
                        s=i;
                        d=j;
                    end
                end
            end
        end
    end
    listV(d)=1;
    distance(e)=b;
    source(e)=s;
    destination(e)=d;
    e=e+1;
end

mfprintf(fid,'\nThe nodes and shortest distances are \n');
mfprintf(fid,'\nFORMAT: Distance(Source, destination) \n');
for g=1:e-1
    mfprintf(fid,'%d(%d,%d)\n',distance(g),source(g),destination(g));
end
status = mclose(fid);
clear;
