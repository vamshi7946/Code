import pandas as pd
import matplotlib.pyplot as pl
import sklearn
from sklearn import preprocessing
from sklearn.preprocessing import Binarizer
dataset = pd.read_csv("Age-salary.csv")
features = dataset.iloc[:,2].values
x = features
x = x.reshape(1,-1)
binarizer_as = Binarizer(2)
feature_scale = binarizer_as.fit_transform(x)
print(feature_scale)
#dataset['bin_col'] = feature_scale
#print(dataset[0:10])
