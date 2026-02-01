

Values = []
count = (int(input('enter number of elements in list')))
i=0
for i in range(count):
    element = int(input(f'enter element value{i}:'))
    Values.append(element)

print(f"values of the list are: {Values}")


if(Values[0]==Values[-1]):
    print(True)
else:
    print(False)  