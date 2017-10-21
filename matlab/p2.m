clc;
fid = fopen('testfile1.txt', 'r');   % Input file
l = fscanf(fid, '%g %g', [1 1]) ;    % Input matrix size from line 1
h = fscanf(fid, '%g %g', [l l])  ;   % Input the matrix
a=h';
fclose(fid);

fid = fopen('Result.txt','wt');     % Output file
fprintf(fid,'Original matrix\n\n'); % Printing the original matrix in the output file
for i=1:l
    for k=1:l
        fprintf(fid,'%6d',a(i,k));  
    end
    fprintf(fid,' \n');
end

k=1:l ;
listV(k)=0 ;
listV(1)=1 ; %list of visited vertices
e=1;
while (e<l)
    min=inf;
    for i=1:l
        if listV(i)==1
            for j=1:l
                if listV(j)==0
                   if min>a(i,j) && i~=j && a(i,j)~=0
                        min=a(i,j);
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

fprintf(fid,'\nThe nodes and shortest distances are \n');
fprintf(fid,'\nFORMAT: Distance(Source, destination) \n');
for g=1:e-1
    fprintf(fid,'%d(%d,%d)\n',distance(g),source(g),destination(g));
end
status = fclose(fid);
clear