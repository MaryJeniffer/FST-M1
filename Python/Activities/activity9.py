first_list=[1,4,3,7,5,6]
second_list=[3,6,8,1,0,9]
odd_list=[]
for num in first_list:
    if(int(num)%2!=0):
        odd_list.append(num)
    
for num in second_list:
    if(int(num)%2==0):
        odd_list.append(num)

print(odd_list)
