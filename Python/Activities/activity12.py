
def sum(num):
    if num:
        return num+sum(num-1)
    else:
        return 0
    

result = sum(5)
print(result)
    