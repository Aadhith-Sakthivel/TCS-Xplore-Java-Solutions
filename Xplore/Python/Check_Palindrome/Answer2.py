def check_palindrome(inp):
  output=[]
  for i in inp:
    name = i
    name = name.casefold()
    if(name == name[::-1]):
      output.append(i)
    return output




if __name__=='__main__': 

        count=int(input()) 

        inp_str=[] 

        for i in range(count): 

                inp_str.append(input()) 

        output=check_palindrome(inp_str) 

        if len(output)!=0: 

                for i in output: 

                        print(i) 

        else: 

                print('No palindrome found')

