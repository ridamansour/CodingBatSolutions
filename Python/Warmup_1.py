def sleep_in(weekday, vacation):
    if not weekday or vacation:
        return True
    else:
        return False


def monkey_trouble(a_smile, b_smile):
    if (a_smile and b_smile) or (not a_smile and not b_smile):
        return True
    else:
        return False


def sum_double(a, b):
    if a == b:
        return a * 4
    else:
        return a + b


def diff21(n):
    if n < 21:
        return 21 - n
    else:
        return (n - 21) * 2


def parrot_trouble(talking, hour):
    if talking:
        if hour < 7 or hour > 20:
            return True
        else:
            return False
    else:
        return False


def makes10(a, b):
    if a == 10 or b == 10 or a + b == 10:
        return True
    else:
        return False


def near_hundred(n):
    if abs(100 - n) <= 10 or abs(200 - n) <= 10:
        return True
    else:
        return False


def pos_neg(a, b, negative):
    if not negative:
        if (a < 0 or b < 0) and not (a < 0 and b < 0):
            return True
        else:
            return False
    elif negative:
        if a < 0 and b < 0:
            return True
        else:
            return False
    return False


def not_string(str):
    if str[:3] == 'not':
        return str
    else:
        return 'not ' + str


def missing_char(str, n):
    return str[:n] + str[n + 1:]


def front_back(str):
    if len(str) > 1:
        return str[len(str) - 1] + str[1:len(str) - 1] + str[0]
    else:
        return str


def front3(str):
    if len(str) < 3:
        return str * 3
    else:
        return str[:3] * 3
