def run_length_encoded_string(string):
    if len(string) == 1:
        return string
    if string == "":
        return ""     

    result = ""
    previous_character = string[0]
    count = 1
    
    for index in range(1,len(string)):
        if string[index].isdigit() or string[index] == " ":
            continue
        if string[index] == previous_character:
            count = count + 1
        else:
            if count == 1:
                result += previous_character
                previous_character = string[index]
                count = 1
            else:
                result += previous_character + str(count)
                previous_character = string[index]
                count = 1
    if count == 1:
        result += previous_character
    else:
        result += previous_character + str(count)           
    return result
    
print(run_length_encoded_string("aaabbcc"))
print(run_length_encoded_string("abbc"))
print(run_length_encoded_string("abbaccd"))
print(run_length_encoded_string("f  aaa.../..bba5655433ccf"))


# def consecutive_counter(word):
#   if not word:
#       return ""
#   count = 1
#   while count < len(word) and word == word[0]:
#       count += 1
#   return (f"{word[0]}{count}" if count > 1 else f"{word[0]}") + consecutive_counter(word[count:])
