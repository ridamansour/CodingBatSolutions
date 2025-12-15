def cigar_party(cigars, is_weekend):
    if is_weekend:
        if cigars == 30 or cigars ==39:
            return False
        return True
    else:
        if cigars>=40 and cigars<=60:
            return True
        return False

def date_fashion(you, date):
    if you<=2 or date<=2:
        return 0
    if you>=8 or date>=8:
        return 2
    return 1

def squirrel_play(temp, is_summer):
    return temp in range(60, 101 if is_summer else 91)

def caught_speeding(speed, is_birthday):
    speed -= 5 if is_birthday else 0
    if speed<=60:
        return 0
    elif speed<=80:
        return 1
    else:
        return 2
def sorta_sum(a, b):
    return a+b if not(a+b>=10 and a+b<=19) else 20

def alarm_clock(day, vacation):
    pronto = "7:00" if not vacation else "10:00"
    tarde = "10:00" if not vacation else "off"
    return pronto if day not in [6,0] else tarde

def love6(a, b):
    return bool((a==6) or (b==6) or ((a+b)==6) or (abs(a-b))==6)

def in1to10(n, outside_mode):
    if not outside_mode:
        return n in range(1,11)
    return n<=1 or n>=10
def near_ten(num):
    return num%10 <=2 or num%10 >=8

