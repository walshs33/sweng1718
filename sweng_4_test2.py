from github import Github

import getpass

#user input
username = "walshs33"
pword = getpass.getpass("password: ")

g = Github(username, pword)

print("contributors:")

for repo in g.get_user().get_repos():
    contributors = repo.get_contributors()
    #for contributor in contributors:
    #    print(contributor.name)

#for repo in g.get_user().get_repos():
#        commits = repo.get_commits()
#        print(repo.name)
#        for commit in commits:
#            print(commit.author)


#for repo in g.get_user().get_repos():
#        print(repo.)
