while 1 < 2:
    import random
    code = "10010010101000010"
    key = ""
    for i in code:
        a = random.randint(0, 1)
        key += str(a)
    code_ints = [int(i) for i in str(code)]
    key_ints = [int(i) for i in str(key)]
    cipher_ints = []
    for x in range(len(code_ints)):
        cipher_bit = code_ints[x] ^ key_ints[x]
        cipher_ints.append(cipher_bit)
        cipher = "".join(str(b) for b in cipher_ints)
    print(cipher)
