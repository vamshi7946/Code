import numpy as np
import pandas as pd
n = int(input("Enter a number:"))
cols = ['marks1','marks2','marks3']
df = pd.DataFrame(np.random.randint(40,100,(n,3)), columns=cols)
print(df)
print("Description:")
print(df.describe())
