from github import Github

import getpass

#user input
username = "walshs33"
pword = getpass.getpass("password: ")

g = Github(username, pword)

print("commits:")


for repo in g.get_user().get_repos():
        commits = repo.get_commits()
        print(repo.name)
        for commit in commits:
            print(commit.author)


#for repo in g.get_user().get_repos():
#        print(repo.)
