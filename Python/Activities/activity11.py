
Fruits = {'apple':50, 'grapes':30, 'orange': 60}

find = str(input('enter fruit name')).lower()

if(find in Fruits):
    print(f'{find} is available in the market and price is {Fruits[find]}')
        
else:
    print(f'we dont have {find} in the market')
    