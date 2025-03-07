import pytest

num1=20
num2=10

def test_add():
    sum=num1+num2
    assert sum==55

def test_sub():
    minus=num1-num2
    assert minus==10

@pytest.mark.activity
def test_prod():
    mul=num1*num2
    assert mul==1000

@pytest.mark.activity
def test_div():
    div=num1/num2
    assert div==2

