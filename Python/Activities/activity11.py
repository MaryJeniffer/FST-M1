fruits={
    "apple":220,
    "pomogranate":260,
    "banana":80,
    "pineapple":60
}

check=input("looking for which fruit? ")
if(check in fruits):
    print("{} is present".format(check))
else:
    print("{} is not present".format(check))
