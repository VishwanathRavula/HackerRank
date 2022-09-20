# def search_in_file(path,searchstring):
#     with open(path, 'r') as file:
#         if searchstring in file.read():
#             print(f'  found string in file {path.name}')
#         else:
#             print('--------------------------------------------string not found')

# from pathlib import Path

# user_input = "C:/Users/Dimaag-2022/Desktop/Projects/ngtransfer_V3.2.6_gpu/saicinpainting/evaluation"  #input('What is the name of your directory')

# searchstring = "load_yaml"

# dir_content = sorted(Path(user_input).iterdir())

# for path in dir_content: 
    
#     if not path.is_dir():
#         print(path)
#         search_in_file(path, searchstring) 
import os

user_input = input('What is the name of your directory')
directory = os.listdir(user_input)

searchstring = "load_yaml"

for fname in directory:
    if os.path.isfile(user_input + os.sep + fname):
        # Full path
        f = open(user_input + os.sep + fname, 'r')

        if searchstring in f.read():
            print('found string in file %s' % fname)
        else:
            print('string not found')
        f.close()