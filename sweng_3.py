from github import Github
import getpass

#user input
username = raw_input("username: ")
pword = getpass.getpass("password: ")

g = Github(username, pword)

print("repos:")
for repo in g.get_user().get_repos():
        print repo.name

print("no. of private repos:")
print g.get_user().total_private_repos
