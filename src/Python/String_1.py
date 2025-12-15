def hello_name(name):
    return 'Hello ' + name+'!'

def make_abba(a, b):
    return a+b*2+a

def make_tags(tag, word):
    return '<{}>{}</{}>'.format(tag,word,tag)

def make_out_word(out, word):
    return out[:len(out)/2] + word + out[len(out)/2:]

def extra_end(str):
    le = len(str)
    return str[le-2:le]*3

def first_two(str):
    return str[:2]

def first_half(str):
    return str[:len(str)/2]

def without_end(str):
    return str[1:len(str)-1]

def combo_string(a, b):
    shorty = a
    longy = b
    if len(a) >len(b):
        shorty = b
        longy = a
    return shorty + longy + shorty

def non_start(a, b):
    return a[1:] +b[1:]

def left2(str):

    return str[2:len(str)]+str[:2]

