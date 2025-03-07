import pandas as pd
from pandas import ExcelWriter

data = {
	'FirstName':["Mary", "Jeniffer", "Hema"],
	'LastName':["Allen", "Lohi", "Rath"],
	'Email':["mary@example.com", "jeniffer@example.com", "hema.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

df=pd.DataFrame(data)
writer = ExcelWriter('activity19_sample.xlsx')
df.to_excel(writer, 'Sheet1', index = False)

writer.close()

df=pd.read_excel("activity19_sample.xlsx")
print(df['Email'])

print("----sort based on firstname----")
print(df.sort_values('FirstName'))

print(df.shape)
