import numpy as np
import nvd3

np.random.seed(100)

chart_type = 'discreteBarChart'
chart = nvd3.discreteBarChart(name=chart_type,height=500,width=500)

ydata = [float(x) for x in np.random.randn(10)]
xdata = [int(x) for x in np.arange(10)]

chart.add_serie(y=ydata, x=xdata)
chart.buildhtml()
chart_html = chart.htmlcontent
