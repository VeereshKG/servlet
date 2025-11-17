<!DOCTYPE html>
<html>
<head>
    <title>Customer FeedBack Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light p-4">

<h2 class="text-center mb-4">Customer Feedback</h2>

<div class="d-flex justify-content-center">
    <div class="card shadow-lg p-4" style="width: 28rem;">

        <form action="feedbackservlet" method="post">

            <label class="form-label">Full Name</label>
            <input type="text" class="form-control mb-2" name="name" required>

            <label class="form-label">Email</label>
            <input type="email" class="form-control mb-2" name="email" required>

            <label class="form-label">Comments</label>
            <textarea class="form-control mb-2" name="comments" rows="3" required></textarea>

            <label class="form-label">Rating</label>
            <div class="mb-3">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="rating" value="1" required>
                    <label class="form-check-label"> 1</label><br>
                    <input class="form-check-input" type="radio" name="rating" value="2" required>
                    <label class="form-check-label">2</label><br>
                    <input class="form-check-input" type="radio" name="rating" value="3" required>
                    <label class="form-check-label">3</label><br>
                    <input class="form-check-input" type="radio" name="rating" value="4" required>
                    <label class="form-check-label">4</label><br>
                    <input class="form-check-input" type="radio" name="rating" value="5" required>
                    <label class="form-check-label">5</label>
                </div>
            </div>

            <button class="btn btn-primary w-100">Submit</button>
        </form>

    </div>
</div>

</body>
</html>
