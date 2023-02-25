from flask import Flask,render_template


app = Flask(__name__)
app.config['TEMPLATES_AUTO_RELOAD'] = True

@app.route("/")
@app.route("/home")
def home_page():
    return render_template("home.html")

@app.route("/students")
def student_list():
    return render_template("student.html")


if __name__=='__main__':
    app.run(debug=True)