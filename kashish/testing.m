x = rand(n,1);
y = sqrt(2)*rand(n,1);
plot(x,y,'yo')
hold on
for i1 = 1:n-1
  for i2 = i1+1:n
    if (A(i1,i2) ~= 0
      plot([x(i1),x(i2)],[y(i1),y(i2)],'y-')
    end
  end
end
hold off
axis equal