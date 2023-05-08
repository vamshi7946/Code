import pandas as pd
import sklearn
from sklearn import preprocessing
dataset = pd.read_csv("Age-salary.csv")
features = dataset.iloc[0:10,[2,3]].values
normalizer_as = preprocessing.Normalizer()
features_scale = normalizer_as.fit_transform(features)
print(features_scale)
