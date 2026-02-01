
Example_list = [1,2,3,4,5,6,7,8,9,10]
sum = 0
for item in Example_list:
    sum = sum+item

print(sum) 

#input from user
L = int(input('enter length of list'))
i =0
s= 0
Values =[]

for i in range(L):
    element = int(input('enter element value'))
    Values.append(element)
    s=s+Values[i]

print(f'Values entered are: {Values}')
print(f"Sum of the values is:{s}")    