import pandas as pd
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}
df=pd.DataFrame(data)
df.to_csv("sample.csv", index=False)

df=pd.read_csv("sample.csv")
print(df)

print("----------------------------")
print(df["Usernames"])
print("----------------------------")
print("Username: ", df["Usernames"][1], " | ", "Password: ", df["Passwords"][1])
print("----------------------------")
print(df.sort_values('Usernames'))
print("----------------------------")	
print(df.sort_values('Passwords', ascending=False))