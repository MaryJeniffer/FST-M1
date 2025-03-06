def Add(num):
  if num:
    return num + Add(num-1)
  else:
    return 0
 
res = Add(10)
 
print(res)