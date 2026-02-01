


len1 = int(input('Enter list1 length'))
len2= int(input('Enter list2 length'))



List1=[]
List2=[]

x=0
y=0
for x in range(len1):
    element = int(input(f'Enter element {x} in List1'))
    List1.append(element)

for y in range(len1):
    element = int(input(f'Enter element {y} in List2'))
    List2.append(element)


List3=[]

i = 0

for i in List1:
    if(i%2!=0):
        List3.append(i)
    
        
for j in List2:
    if(j%2==0):
        List3.append(j)

print(List3)        

     