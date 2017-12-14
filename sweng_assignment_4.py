import numpy as np
import nvd3
from github import Github
from IPython.display import display, HTML

import getpass

#function to return length of paginatedList, whatever the hell that is
def paginatedLen( list ):
    a = 0
    for l in list:
        a = a + 1
    return a;

def makeChart( xdat, ydat ):
    chart_type = 'pieChart'
    chart = nvd3.pieChart(name = chart_type, color_category = 'category20c', height = 450, width = 450)
    chart.add_serie(y=ydat, x=xdat)
    chart.buildhtml()
    chart_html = chart.htmlcontent
    display(HTML(chart_html))
    return;

#user input
username = "walshs33"
pword = getpass.getpass("password: ")
reponame = input("repo: ")

#init git
g = Github(username, pword)

#get contributors
#for repo in g.get_user().get_repos():
#    if repo.full_name == reponame:
        repo = g.get_user().get_repo(reponame)
        contributors = repo.get_contributors()
        xdata = []
        for contributor in contributors:
            xdata.insert(len(xdata), contributor.name)
        #xdata = contributors
        a = []
        #get commit count per contributor
        for contributor in contributors:
            commits = repo.get_commits(author=contributor)
            a.insert(len(a), paginatedLen(commits))

        makeChart( xdat = xdata, ydat = a )
