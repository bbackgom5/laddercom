import pandas as pd

df2=pd.read_csv('survey.csv')
print(df2.head())

#평균과 합
print(df2.income.mean())
print(df2.income.sum())

#중앙값
print(df2.income.median())

#데이터 프레임 기초 통계량
print(df2.describe())

#수입의 기초통계량
print(df2.income.describe())

#빈도분석
print(df2.sex.value_counts())

#두집단 평균
print(df2.groupby(df2.sex).mean())
print(df2.groupby(df2.stress).mean())