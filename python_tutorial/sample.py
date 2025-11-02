def main():
    fizzbuzz_if()

def strslice():
    word = "hello"
    print("word[0]: " + word[0])
    print("word[0:2]: " + word[0:2])
    print("word[-1]: " + word[-1])
    print("word[::-1]: " + word[::-1])
    print("word[::2]: " + word[::2])
    print("word[::3]: " + word[::3])
    print("word[::4]: " + word[::4])
    print("word[::5]: " + word[::5])

def printend():
    a, b = 0, 1
    while a < 1000:
        print(a, end=f',\n')
        a, b = b, a+b

def fizzbuzz_if():
    for i in list(range(1, 101)):
        if i % 15 == 0:
            print('i =', i, 'fizzbuzz')
        elif i % 5 == 0:
            print('i =', i, 'buzz')
        elif i % 3 == 0:
            print('i =', i, 'fizz')
        


if __name__ == "__main__":
    main()

